package com.nt.test;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * LombokTest class demonstrates the use of Lombok annotations to reduce boilerplate code in Java.
 * It includes annotations for generating getters, setters, constructors, toString, equals, and hashCode methods.
 * 
 * Annotations used:
 * - @Setter: Generates setter methods for all fields.
 * - @AllArgsConstructor: Generates a constructor with all fields as parameters.
 * - @NoArgsConstructor: Generates a no-argument constructor with protected access level.
 * - @Getter: Generates getter methods for all fields.
 * - @RequiredArgsConstructor: Generates a constructor for final or non-null fields only.
 * - @ToString: Generates a toString method.
 * - @Data: Combines @ToString, @EqualsAndHashCode, @Getter, and @Setter.
 * - @EqualsAndHashCode: Generates equals and hashCode methods based on the fields.
 */

//using all annotations of lombok 

@Data	 // Combines @ToString, @EqualsAndHashCode, @Getter, and @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED) // Protected no-args constructor	
@AllArgsConstructor // All-args constructor
@RequiredArgsConstructor // Constructor for final or non-null fields
@ToString // Generates toString method
@EqualsAndHashCode // Generates equals and hashCode methods
public class LombokTest {
	
	@NonNull // Ensures that this field cannot be null
	private String name;
	
	@Getter // Generates getter for age
	@Setter // Generates setter for age
	private int age;
	
	@Getter // Generates getter for address
	@Setter // Generates setter for address
	private String address;

	// The @Data annotation already includes the necessary methods, so no need to redefine them.
}


/** * This class demonstrates the use of Lombok to reduce boilerplate code in Java applications.
 Note: The @Data annotation automatically generates toString, equals, hashCode, getters, and setters for all fields.
 The @NonNull annotation ensures that the 'name' field cannot be null, and it will throw a NullPointerException if it is set to null.
 The @NoArgsConstructor with AccessLevel.PROTECTED ensures that the no-argument constructor is protected,
 which is useful for frameworks that require a no-args constructor but should not be publicly accessible.
 The @AllArgsConstructor and @RequiredArgsConstructor annotations generate constructors with all fields and only final or non-null fields, respectively.
 This class can be used in a Java application to demonstrate the benefits of using Lombok for reducing boilerplate code.
 The @ToString and @EqualsAndHashCode annotations ensure that the class has a meaningful string representation and can be compared based on its fields.
 The @Getter and @Setter annotations provide a clean way to manage field access without manually writing getter and setter methods.
*/