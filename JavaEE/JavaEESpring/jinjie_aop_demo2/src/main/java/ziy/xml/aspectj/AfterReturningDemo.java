package ziy.xml.aspectj;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author ziy
 * @version 1.0
 * @date 上午10:22 2020/10/22
 * @description TODO:
 * @className AfterReturning
 */
public class AfterReturningDemo {
    private void printReturn(Object r) {
        System.out.println("====模拟对返回值的处理："+r+" ====");
    }
}
