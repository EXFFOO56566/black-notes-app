.class final Lcom/google/android/gms/internal/ads/mj0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/zn1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zn1<",
        "Lcom/google/android/gms/internal/ads/ws;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Ljava/lang/String;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/d5;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/jj0;Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/mj0;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/mj0;->b:Lcom/google/android/gms/internal/ads/d5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/ws;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mj0;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/mj0;->b:Lcom/google/android/gms/internal/ads/d5;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/ws;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/d5;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method
