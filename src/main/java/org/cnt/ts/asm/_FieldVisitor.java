package org.cnt.ts.asm;

import org.springframework.asm.AnnotationVisitor;
import org.springframework.asm.FieldVisitor;
import org.springframework.asm.Opcodes;
import org.springframework.asm.TypePath;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class _FieldVisitor extends FieldVisitor {

	public _FieldVisitor() {
		super(Opcodes.ASM7);
	}
	
	@Override
	public AnnotationVisitor visitAnnotation(String descriptor, boolean visible) {
		log("-FieldVisitor-visitAnnotation-");
		log("descriptor", descriptor);
		log("visible", visible);
		return new _AnnotationVisitor();
	}
	
	@Override
	public AnnotationVisitor visitTypeAnnotation(int typeRef, TypePath typePath, String descriptor, boolean visible) {
		log("-FieldVisitor-visitTypeAnnotation-");
		log("typeRef", typeRef);
		log("typePath", typePath);
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
