.class final Lcom/google/android/gms/internal/ads/rj2;
.super Lcom/google/android/gms/internal/ads/ro;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/ro<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic c:Lcom/google/android/gms/internal/ads/oj2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/oj2;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/rj2;->c:Lcom/google/android/gms/internal/ads/oj2;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ro;-><init>()V

    return-void
.end method


# virtual methods
.method public final cancel(Z)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rj2;->c:Lcom/google/android/gms/internal/ads/oj2;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/oj2;->a(Lcom/google/android/gms/internal/ads/oj2;)V

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/ro;->cancel(Z)Z

    move-result p1

    return p1
.end method
