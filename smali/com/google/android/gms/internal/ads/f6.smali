.class final Lcom/google/android/gms/internal/ads/f6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/common/internal/c$b;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/ro;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/x5;Lcom/google/android/gms/internal/ads/ro;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/f6;->a:Lcom/google/android/gms/internal/ads/ro;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lb/c/b/a/c/b;)V
    .locals 2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/f6;->a:Lcom/google/android/gms/internal/ads/ro;

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Connection failed."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/ro;->a(Ljava/lang/Throwable;)Z

    return-void
.end method
