.class public final Lcom/google/android/gms/internal/ads/h62;
.super Lcom/google/android/gms/internal/ads/x62;
.source ""


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/l52;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ba0$a;II)V
    .locals 7

    const/16 v6, 0x4c

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/x62;-><init>(Lcom/google/android/gms/internal/ads/l52;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ba0$a;II)V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/x62;->e:Ljava/lang/reflect/Method;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/x62;->a:Lcom/google/android/gms/internal/ads/l52;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/l52;->a()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/x62;->d:Lcom/google/android/gms/internal/ads/ba0$a;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/pi0;->d:Lcom/google/android/gms/internal/ads/pi0;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/pi0;->c:Lcom/google/android/gms/internal/ads/pi0;

    :goto_0
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/ba0$a;->e(Lcom/google/android/gms/internal/ads/pi0;)Lcom/google/android/gms/internal/ads/ba0$a;

    return-void
.end method
