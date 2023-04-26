package org.example.coreTech.algorithm;

import java.util.Scanner;
public class LocationDistanceCalculator {
    public static final double EARTH_RADIUS = 6371.0; // 地球半径，单位：千米

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入第一个位置的经度：");
        double longitude1 = input.nextDouble();
        System.out.print("请输入第一个位置的纬度：");
        double latitude1 = input.nextDouble();
        System.out.print("请输入第二个位置的经度：");
        double longitude2 = input.nextDouble();
        System.out.print("请输入第二个位置的纬度：");
        double latitude2 = input.nextDouble();

        double distance = calculateDistance(longitude1, latitude1, longitude2, latitude2);
        System.out.printf("两个位置之间的距离为：%.2f千米\n", distance);
    }

    public static double calculateDistance(double longitude1, double latitude1, double longitude2, double latitude2) {
        double radianLat1 = Math.toRadians(latitude1);
        double radianLat2 = Math.toRadians(latitude2);
        double a = Math.toRadians(latitude1) - Math.toRadians(latitude2);
        double b = Math.toRadians(longitude1) - Math.toRadians(longitude2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) + Math.cos(radianLat1) * Math.cos(radianLat2) * Math.pow(Math.sin(b / 2), 2)));
        return s * EARTH_RADIUS;
    }
}
