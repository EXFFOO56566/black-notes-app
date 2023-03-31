.class final Lcom/google/android/gms/internal/ads/z8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/vo;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/vo<",
        "Lcom/google/android/gms/internal/ads/r7;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/s8;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/w8;Lcom/google/android/gms/internal/ads/s8;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/z8;->a:Lcom/google/android/gms/internal/ads/s8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/r7;

    const-string v0, "Getting a new session for JS Engine."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/z8;->a:Lcom/google/android/gms/internal/ads/s8;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/r7;->z()Lcom/google/android/gms/internal/ads/d9;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/yo;->a(Ljava/lang/Object;)V

    return-void
.end method
