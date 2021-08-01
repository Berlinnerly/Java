package com.berlin.book.service;

import com.berlin.book.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.rmi.NotBoundException;

/**
 * @author Berlin
 * @date 2021/1/27 10:34
 * @description
 */

@Service
//@Transactional
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;


    /**
     * @Transactional 对方法中所有的操作作为一个事务进行管理
     * 在方法上使用，只对方法有效果，在类上使用，对类中的所有方法都有效果
     * @param bid
     * @param uid
     *
     * @Transactional中可以设置的属性：
     *
     * 1. propagation： 事务的传播级别
     *      A方法和B方法都有事务，当A在调用B时，会将A中的事务传播给B方法，B方法对于事务的处理方式就是事务的传播行为
     *      Propagation.REQUIRED： 必须使用调用者的事务（默认值）
     *      Propagation.REQUIRES_NEW：将调用者的事务挂起，不适用调用者的事务，使用新的事务进行处理
     *
     * 2. isolation： 事务的隔离级别，在并发的情况下操作数据的一种规定
     *      读未提交： 脏读    1
     *      读已提交： 不可重复读     2
     *      可重复读： 幻读    4
     *      串行化： 最高级别（单线程），性能低，消耗大  8
     *
     * 3. timeout： 事务的超时
     *      在事务强制回滚前最多可以等待的时间
     *
     * 4. readOnly： 只读
     *      指定当前事务中的一系列操作是否为只读
     *      若设置为只读，不管事务中有没有写的操作MySQL都会在请求访问数据的时候不加锁，提高性能
     *      但是如果有写操作的情况下，建议一定不能设置只读
     *
     *
     * 5. rollbackFor | rollbackForClassName | noRollbackFor | noRollbackForClassName
     *      设置事务回滚的条件
     *      rollbackFor： 根据异常进行回滚，异常的Class对象
     *      noRollbackFor： 不根据什么异常回滚，异常的Class对象
     *      rollbackForClassName： 根据异常进行回滚，异常的全限定名
     *      noRollbackForClassName： 不根据什么异常回滚，异常的全限定名
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW, timeout = 3, rollbackFor = {NullPointerException.class})
    public void buyBook(String bid, String uid) {
        Integer price = bookDao.selectPrice(bid);
        bookDao.updateSt(bid);
        bookDao.updateBalance(uid, price);
    }
}
