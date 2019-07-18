package org.cnt.ts.asm;

import org.springframework.asm.AnnotationVisitor;
import org.springframework.asm.Opcodes;

/**
 * @author lixinjie
 * @since 2019-07-18
 */
public class _AnnotationVisitor extends AnnotationVisitor {

	public _AnnotationVisitor() {
		super(Opcodes.ASM7);
	}
	
	@Override
	public void visit(String name, Object value) {
		log("-AnnotationVisitor-visit-");
		log("name", name);
		log("value", value);
	}
	
	@Override
	public void visitEnum(String name, String descriptor, String value) {
		log("-AnnotationVisitor-visitEnum-");
		log("name", name);
		log("descriptor", descriptor);
		log("value", value);
	}
	
	@Override
	public AnnotationVisitor visitAnnotation(String name, String descriptor) {
		log("-AnnotationVisitor-visitAnnotation-");
		log("name", name);
		log("descriptor", descriptor);
		return this;
	}
	
	@Override
	public AnnotationVisitor visitArray(String name) {
		log("-AnnotationVisitor-visitArray-");
		log("name", name);
		return this;
	}
	
	void log(String key, Object value) {
		log(key + " = " + value);
	}
	
	void log(Object obj) {
		System.out.println(obj);
	}
}
