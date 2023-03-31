.class final Lcom/google/android/gms/internal/ads/p9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/mm;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/mm<",
        "Lcom/google/android/gms/internal/ads/r7;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/r7;

    sget-object v0, Lcom/google/android/gms/internal/ads/p4;->g:Lcom/google/android/gms/internal/ads/d5;

    const-string v1, "/log"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/e9;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/p4;->o:Lcom/google/android/gms/internal/ads/j5;

    const-string v1, "/result"

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/ads/e9;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    return-void
.end method
