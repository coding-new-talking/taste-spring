package org.cnt.ts.bean.regmeatbd;

import java.util.Map;

import javax.annotation.PostConstruct;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lixinjie
 * @since 2019-07-02
 */
@Slf4j
public class ChickenFrwk {

	private Map<String, Object> attr;
	
	public ChickenFrwk(Map<String, Object> attr) {
		this.attr = attr;
	}
	
	@PostConstruct
	public void init() {
		log.info("{}", attr);
	}
}
