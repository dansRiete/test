package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PecsWildcardRuleDemo {
    public static void main(String[] args) {

//        List<A> listA = new ArrayList<B>(); // FAIL TO COMPILE ArrayList<B> is not a subtype of List<A>
//        Map<String, Object> map2 = new HashMap<String, String>(); // FAIL TO COMPILE, same here
        Map<String, ?> map1 = new HashMap<String, String>();    //  Map<String, ?> is implicitly Map<String, ? extends Object>

        //  Producer Extends, Consumer Super

        //  Consumer
        List<? super B> consumerList = new ArrayList<A>();
        //  Adding to the list
        consumerList.add(new B());
        consumerList.add(new C());
//        consumerList.add(new A());    //  Fail to compile, to a list of <? super T> we can add only IS A T objects
//        consumerList.add(new AA());   //  Fail to compile

        //  Getting from the list
        System.out.println(consumerList.get(0));    //  Returns an Object
        System.out.println(((B) consumerList.get(0)).getMessage()); // Need to cast explicitly
//        System.out.println(consumerList.get(0).getMessage()); //  Fail to compile from a consumer we can get only an Object


        //  Producer
        List<? extends B> producerList = List.of(new B());
        producerList.add(null); //  Only nulls allowed to add
//        producerList.add(new B());   // FAIL TO COMPILE, cannot add to a producer. There can be list of ony subtypes of B, so we cannot know for sure
        System.out.println(producerList.get(0).getMessage());
    }
}
