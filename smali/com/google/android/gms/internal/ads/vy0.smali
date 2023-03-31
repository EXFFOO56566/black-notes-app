.class public final Lcom/google/android/gms/internal/ads/vy0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/py0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/py0<",
        "Lcom/google/android/gms/internal/ads/ac0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ad0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ad0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/vy0;->a:Lcom/google/android/gms/internal/ads/ad0;

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Landroid/view/View;Lcom/google/android/gms/internal/ads/wy0;)Ljava/lang/Object;
    .locals 3

    new-instance p3, Lcom/google/android/gms/internal/ads/xy0;

    sget-object v0, Lcom/google/android/gms/internal/ads/yy0;->a:Lcom/google/android/gms/internal/ads/id0;

    invoke-direct {p3, p0, v0}, Lcom/google/android/gms/internal/ads/xy0;-><init>(Lcom/google/android/gms/internal/ads/vy0;Lcom/google/android/gms/internal/ads/id0;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vy0;->a:Lcom/google/android/gms/internal/ads/ad0;

    new-instance v1, Lcom/google/android/gms/internal/ads/d30;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lcom/google/android/gms/internal/ads/d30;-><init>(Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/id1;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p3}, Lcom/google/android/gms/internal/ads/ad0;->a(Lcom/google/android/gms/internal/ads/d30;Lcom/google/android/gms/internal/ads/fc0;)Lcom/google/android/gms/internal/ads/cc0;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/az0;

    invoke-direct {p2, p0, p1}, Lcom/google/android/gms/internal/ads/az0;-><init>(Lcom/google/android/gms/internal/ads/vy0;Lcom/google/android/gms/internal/ads/cc0;)V

    invoke-virtual {p4, p2}, Lcom/google/android/gms/internal/ads/wy0;->a(Lcom/google/android/gms/ads/internal/e;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/cc0;->i()Lcom/google/android/gms/internal/ads/ac0;

    move-result-object p1

    return-object p1
.end method
