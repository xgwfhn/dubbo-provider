package dubbo.filter;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.RpcException;

public class DubboContextFilter implements Filter {
	private static Logger log = (Logger) LoggerFactory.getLogger(DubboContextFilter.class);
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
       /* String var= RpcContext.getContext().getAttachment("");
        //todo 其他相关处理
        return invoker.invoke(invocation);*/
    	long start = System.currentTimeMillis();
		Result result = invoker.invoke(invocation);
		long elapsed = System.currentTimeMillis() - start;
		if (invoker.getUrl() != null) {
 
			// log.info("[" +invoker.getInterface() +"] [" + invocation.getMethodName() +"] [" + elapsed +"]" );
			/*log.info("[{}], [{}], {}, [{}], [{}], [{}]", invoker.getInterface(), invocation.getMethodName(), 
                         Arrays.toString(invocation.getArguments()), result.getValue(),
                       result.getException(), elapsed);*/
			log.info("method:"+invocation.getMethodName());
            System.out.println("11111111111111");
		}
		return result;


    }

}
