/*
 *     Copyright 2019. http://devonline.academy
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package by.guru13.temp.nullobject;

/**
 * @author Aliaksei Huryanchyk
 */
public class Example04ConstructorMain {

    public static void main(String[] args) {
        final Example04Constructor example1 = new Example04Constructor.Builder()
            .setParam1(2)
            .setParam2("string")
            .build();
        System.out.println(example1.getParam1());
        System.out.println(example1.getParam2());
        System.out.println(example1.getParam3());
        System.out.println(example1.getParam4());
        System.out.println(example1.getParam5());

        final Example04Constructor example2 = new Example04Constructor.Builder()
            .setParam1(2)
            .setParam2("string")
            .setParam3(true)
            .setParam4(new Object())
            .setParam5(8)
            .build();
        System.out.println(example2.getParam1());
        System.out.println(example2.getParam2());
        System.out.println(example2.getParam3());
        System.out.println(example2.getParam4());
        System.out.println(example2.getParam5());
    }
}
