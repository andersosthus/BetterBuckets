package com.grapz.betterbuckets.Buckets;

public final class BucketHandler {
  private static GoldBucket goldBucket;
  
  public static void init() {
    goldBucket = new GoldBucket();
  }
}
