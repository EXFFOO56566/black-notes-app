.class final Lcom/google/android/gms/internal/ads/u8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/vo;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/vo<",
        "Lcom/google/android/gms/internal/ads/e9;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/s8;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/s8;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/u8;->a:Lcom/google/android/gms/internal/ads/s8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/e9;

    const-string p1, "Releasing engine reference."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/u8;->a:Lcom/google/android/gms/internal/ads/s8;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/s8;->a(Lcom/google/android/gms/internal/ads/s8;)Lcom/google/android/gms/internal/ads/w8;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/w8;->d()V

    return-void
.end method
