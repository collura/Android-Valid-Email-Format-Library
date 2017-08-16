
# Validation Utils Library

[![](https://jitpack.io/v/collura/ValidEmailFormat.svg)](https://jitpack.io/#collura/ValidEmailFormat) 

A collection of Validation Classes for Android

## Gradle

Put this lines in your app level Gradle file:

```
repositories {   
              maven { url 'https://jitpack.io' }
}

dependencies {
	        compile 'com.github.collura:ValidationUtilsLibrary:v1.3'
}
```

## Getting Started

```
ValidEmailFormat validEmailFormat = new ValidEmailFormat();
Boolean isValid = validEmailFormat.test(String email);
	
```

## Authors

[Betto Collura](https://github.com/collura)


