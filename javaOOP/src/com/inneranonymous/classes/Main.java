package com.inneranonymous.classes;

public class Main {
    public static void main(String[] args) {
        RewardClass rewardClass = new RewardClass();
        RewardClass rewardClass1 = new RewardClass();
        RewardClass rewardClass2 = new RewardClass(){
            @Override
            public void RewardMethod() {
                System.out.println("your reward is $30");
            }
        };
        RewardClass rewardClass3 =  new OverrideRewardClass();
        rewardClass.RewardMethod();
        rewardClass1.RewardMethod();
        rewardClass2.RewardMethod();
        rewardClass3.RewardMethod();

        System.out.println(rewardClass1.getClass());
        System.out.println(rewardClass2.getClass());
    }
}
