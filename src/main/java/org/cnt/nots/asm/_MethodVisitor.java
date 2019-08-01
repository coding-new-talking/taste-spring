package org.cnt.nots.asm;

import org.springframework.asm.AnnotationVisitor;
import org.springframework.asm.MethodVisitor;
import org.springframework.asm.Opcodes;
import org.springframework.asm.TypePath;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class _MethodVisitor extends MethodVisitor {

	private int version;
	
	public _MethodVisitor() {
		super(Opcodes.ASM7);
		this.version = _AsmMain.getMvVersion();
	}

	@Override
	public void visitParameter(String name, int access) {
		log("---MethodVisitor-visitParameter---");
		log("name", name);
		log("access", access);
	}
	
	@Override
	public AnnotationVisitor visitAnnotationDefault() {
		log("---MethodVisitor-visitAnnotationDefault---");
		return new _AnnotationVisitor();
	}
	
	@Override
	public AnnotationVisitor visitAnnotation(String descriptor, boolean visible) {
		log("---MethodVisitor-visitAnnotation---");
		log("descriptor", descriptor);
		log("visible", visible);
		return new _AnnotationVisitor();
	}
	
	@Override
	public void visitAnnotableParameterCount(int parameterCount, boolean visible) {
		log("---MethodVisitor-visitAnnotableParameterCount---");
		log("parameterCount", parameterCount);
		log("visible", visible);
	}
	
	@Override
	public AnnotationVisitor visitParameterAnnotation(int parameter, String descriptor, boolean visible) {
		log("---MethodVisitor-visitParameterAnnotation---");
		log("parameter", parameter);
		log("descriptor", descriptor);
		log("visible", visible);
		return new _AnnotationVisitor();
	}
	
	@Override
	public AnnotationVisitor visitTypeAnnotation(int typeRef, TypePath typePath, String descriptor, boolean visible) {
		log("---MethodVisitor-visitTypeAnnotation---");
		log("typeRef", typeRef);
		log("typePath", typePath);
		log("descriptor", descriptor);
		log("visible", visible);
		return new _AnnotationVisitor();
	}
	
	@Override
	public void visitEnd() {
		log("---MethodVisitor-visitEnd---");
	}

	void log(String key, Object value) {
		System.out.println(key + " = " + value);
	}
	
	void log(String str) {
		System.out.println(str + version + "--");
	}
}
