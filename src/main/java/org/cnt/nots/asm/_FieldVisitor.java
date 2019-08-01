package org.cnt.nots.asm;

import org.springframework.asm.AnnotationVisitor;
import org.springframework.asm.FieldVisitor;
import org.springframework.asm.Opcodes;
import org.springframework.asm.TypePath;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class _FieldVisitor extends FieldVisitor {

	private int version;
	
	public _FieldVisitor() {
		super(Opcodes.ASM7);
		this.version = _AsmMain.getFvVersion();
	}
	
	@Override
	public AnnotationVisitor visitAnnotation(String descriptor, boolean visible) {
		log("---FieldVisitor-visitAnnotation---");
		log("descriptor", descriptor);
		log("visible", visible);
		return new _AnnotationVisitor();
	}
	
	@Override
	public AnnotationVisitor visitTypeAnnotation(int typeRef, TypePath typePath, String descriptor, boolean visible) {
		log("---FieldVisitor-visitTypeAnnotation---");
		log("typeRef", typeRef);
		log("typePath", typePath);
		log("descriptor", descriptor);
		log("visible", visible);
		return new _AnnotationVisitor();
	}
	
	@Override
	public void visitEnd() {
		log("---FieldVisitor-visitEnd---");
	}
	
	void log(String key, Object value) {
		System.out.println(key + " = " + value);
	}
	
	void log(String str) {
		System.out.println(str + version + "--");
	}
}
