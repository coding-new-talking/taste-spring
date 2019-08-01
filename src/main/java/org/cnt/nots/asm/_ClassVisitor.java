package org.cnt.nots.asm;

import java.util.Arrays;

import org.springframework.asm.AnnotationVisitor;
import org.springframework.asm.ClassVisitor;
import org.springframework.asm.FieldVisitor;
import org.springframework.asm.MethodVisitor;
import org.springframework.asm.Opcodes;
import org.springframework.asm.TypePath;

/**
 * @author lixinjie
 * @since 2019-07-18
 */
public class _ClassVisitor extends ClassVisitor {

	private int version;
	
	public _ClassVisitor() {
		super(Opcodes.ASM7);
		this.version = _AsmMain.getCvVersion();
	}

	@Override
	public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
		log("---ClassVisitor-visit---");
		log("version", version);
		log("access", access);
		log("name", name);
		log("signature", signature);
		log("superName", superName);
		log("interfaces", Arrays.toString(interfaces));
	}
	
	@Override
	public AnnotationVisitor visitAnnotation(String descriptor, boolean visible) {
		log("---ClassVisitor-visitAnnotation---");
		log("descriptor", descriptor);
		log("visible", visible);
		return new _AnnotationVisitor();
	}
	
	@Override
	public AnnotationVisitor visitTypeAnnotation(int typeRef, TypePath typePath, String descriptor, boolean visible) {
		log("---ClassVisitor-visitTypeAnnotation---");
		log("typeRef", typeRef);
		log("typePath", typePath);
		log("descriptor", descriptor);
		log("visible", visible);
		return new _AnnotationVisitor();
	}
	
	@Override
	public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
		log("---ClassVisitor-visitField---");
		log("access", access);
		log("name", name);
		log("descriptor", descriptor);
		log("signature", signature);
		log("value", value);
		return new _FieldVisitor();
	}
	
	@Override
	public MethodVisitor visitMethod(int access, String name, String descriptor, String signature,
			String[] exceptions) {
		log("---ClassVisitor-visitMethod---");
		log("access", access);
		log("name", name);
		log("descriptor", descriptor);
		log("signature", signature);
		log("exceptions", Arrays.toString(exceptions));
		return new _MethodVisitor();
	}
	
	@Override
	public void visitEnd() {
		log("---ClassVisitor-visitEnd---");
	}
	
	void log(String key, Object value) {
		System.out.println(key + " = " + value);
	}
	
	void log(String str) {
		System.out.println(str + version + "--");
	}
}
