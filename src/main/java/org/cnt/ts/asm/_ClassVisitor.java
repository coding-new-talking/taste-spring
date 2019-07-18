package org.cnt.ts.asm;

import java.util.Arrays;

import org.springframework.asm.AnnotationVisitor;
import org.springframework.asm.ClassVisitor;
import org.springframework.asm.Opcodes;

/**
 * @author lixinjie
 * @since 2019-07-18
 */
public class _ClassVisitor extends ClassVisitor {

	public _ClassVisitor() {
		super(Opcodes.ASM7);
	}

	@Override
	public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
		log("-ClassVisitor-visit-");
		log("version", version);
		log("access", access);
		log("name", name);
		log("signature", signature);
		log("superName", superName);
		log("interfaces", Arrays.toString(interfaces));
	}
	
	@Override
	public AnnotationVisitor visitAnnotation(String descriptor, boolean visible) {
		log("-ClassVisitor-visitAnnotation-");
		log("descriptor", descriptor);
		log("visible", visible);
		return new _AnnotationVisitor();
	}
	
	void log(String key, Object value) {
		log(key + " = " + value);
	}
	
	void log(Object obj) {
		System.out.println(obj);
	}
}
