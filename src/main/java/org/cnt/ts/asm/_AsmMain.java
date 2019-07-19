package org.cnt.ts.asm;

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

}
