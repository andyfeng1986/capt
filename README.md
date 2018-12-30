capt
======

Capt is short for Class Annotation Processor Tool on Android.

Like apt, capt provide some mechanism to parse annotations at compile time. 

But capt can do more stuff than apt, because capt visit every jvm classes, and apt only visit java sources.

Further more, capt also provides the chance to update every original class.

For more information please see the [wiki](https://github.com/CoffeePartner/capt/wiki).

Hope you enjoy it!

Quick Start
--------

##### Add capt plugin to gradle script classpath:

```groovy
classpath 'coffeepartner.capt:capt-plugin:1.0.0-RC1'
```

##### Apply capt plugin on Android application or library module:

```gradle
apply plugin: 'com.android.application' 
// or apply plugin: 'com.android.library'
apply plugin: 'capt'
```

##### Add plugins for capt

```groovy
dependencies {
    capt 'xxx'
    debugCapt 'xxx'
    androidTestCapt 'xxx'
}

capt {
    plugins {
        pluginOfCapt {
            // arguments for pluginOfCapt
        }
    }
}
```

For more usage, see the [example]() and [wiki](https://github.com/CoffeePartner/capt/wiki).

License
-------

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


