.class final Lcom/google/android/gms/internal/ads/ap;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/zn1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zn1<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/vo;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/to;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/yo;Lcom/google/android/gms/internal/ads/vo;Lcom/google/android/gms/internal/ads/to;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ap;->a:Lcom/google/android/gms/internal/ads/vo;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/ap;->b:Lcom/google/android/gms/internal/ads/to;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ap;->a:Lcom/google/android/gms/internal/ads/vo;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/vo;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ap;->b:Lcom/google/android/gms/internal/ads/to;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/to;->run()V

    return-void
.end method
