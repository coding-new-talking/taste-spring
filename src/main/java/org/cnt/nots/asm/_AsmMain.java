package org.cnt.nots.asm;

import org.springframework.asm.ClassReader;

/**
 * @author lixinjie
 * @since 2019-07-18
 */
public class _AsmMain {

	public static void main(String[] args) throws Exception {
		ClassReader cr = new ClassReader(D.class.getName());
		_ClassVisitor cv = new _ClassVisitor();
		cr.accept(cv, 0);
	}

	static int avVersion = 0;
	
	static int cvVersion = 0;
	
	static int fvVersion = 0;
	
	static int mvVersion = 0;
	
	static int getAvVersion() {
		return ++avVersion;
	}
	
	static int getCvVersion() {
		return ++cvVersion;
	}
	
	static int getFvVersion() {
		return ++fvVersion;
	}
	
	static int getMvVersion() {
		return ++mvVersion;
	}
}
