# Validation Utils Library

A collection of Validation Classes for Android

## Gradle

Put this lin in your Grable file:

```
repositories {   
              maven { url 'https://jitpack.io' }
}

dependencies {
	        compile 'com.github.collura:ValidationUtilsLibrary:v1.1'
}
```

## Getting Started

```
ValidEmailFormat validEmailFormat = new ValidationUtils();
Boolean isValid = validEmailFormat.test(String email);
	
```

## Authors

[Betto Collura](https://github.com/collura)
