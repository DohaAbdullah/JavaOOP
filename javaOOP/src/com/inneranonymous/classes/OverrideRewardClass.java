package com.inneranonymous.classes;

public class OverrideRewardClass extends RewardClass {


    @Override
    public void RewardMethod() {
        super.RewardMethod();
        System.out.println("your reward is $20");
    }
}
