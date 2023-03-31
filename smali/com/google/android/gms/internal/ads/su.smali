.class public final Lcom/google/android/gms/internal/ads/su;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# direct methods
.method public static a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/lu;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/eq1;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/internal/ads/o;Lcom/google/android/gms/ads/internal/i;Lcom/google/android/gms/ads/internal/a;Lcom/google/android/gms/internal/ads/wj2;Lcom/google/android/gms/internal/ads/yi2;Z)Lcom/google/android/gms/internal/ads/ws;
    .locals 15

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/vu;

    const/4 v9, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move/from16 v14, p12

    invoke-direct/range {v1 .. v14}, Lcom/google/android/gms/internal/ads/vu;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/lu;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/eq1;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/internal/ads/o;Lcom/google/android/gms/ads/internal/i;Lcom/google/android/gms/ads/internal/a;Lcom/google/android/gms/internal/ads/wj2;Lcom/google/android/gms/internal/ads/yi2;Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/kn;->a(Lcom/google/android/gms/internal/ads/nl1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/ws;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->g()Lcom/google/android/gms/internal/ads/ik;

    move-result-object v1

    const-string v2, "AdWebViewFactory.newAdWebView2"

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/ik;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/it;

    const-string v2, "Webview initialization failed."

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/ads/it;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
