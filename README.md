
# Email Format Validation Library

[![](https://jitpack.io/v/collura/ValidEmailFormat.svg)](https://jitpack.io/#collura/ValidEmailFormat) 

A simple project for E-Mail format Validation.

## Gradle

Put this lines in your app level Gradle file:

```
repositories {   
              maven { url 'https://jitpack.io' }
}
```

And

```
dependencies {
	        compile 'com.github.collura:ValidationUtilsLibrary:v1.3'
}
```

## Getting Started
###Accept format as user@domain.com and return "true".  
Without "@" or "domain.com", return "false".  

```
ValidEmailFormat validEmailFormat = new ValidEmailFormat();
Boolean isValid = validEmailFormat.test(String email);
	
```



