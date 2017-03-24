/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timestamp Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.TimestampLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getTimestampLiteral()
 * @model
 * @generated
 */
public interface TimestampLiteral extends Expression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getTimestampLiteral_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.behavior.TimestampLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // TimestampLiteral
