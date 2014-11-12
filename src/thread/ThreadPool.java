package thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
	public static final ThreadPoolExecutor getThreadPoolExecutor() {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(64, 64, 0L, TimeUnit.MILLISECONDS,
				new ArrayBlockingQueue<Runnable>(128), new ThreadPoolExecutor.CallerRunsPolicy());
		return executor;
	}
}
