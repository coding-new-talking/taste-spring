package org.cnt.ts.schedule;

import java.util.List;

/**
 * @author lixinjie
 * @since 2019-09-23
 */
public interface SimpleService {

	List<String> fetchMetadata(String taskId);
}
