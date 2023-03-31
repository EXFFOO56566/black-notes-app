.class final Lcom/google/android/gms/internal/ads/e30;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/zn1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zn1<",
        "Lcom/google/android/gms/internal/ads/k20;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/zn1;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/y20;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/y20;Lcom/google/android/gms/internal/ads/zn1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/e30;->b:Lcom/google/android/gms/internal/ads/y20;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/e30;->a:Lcom/google/android/gms/internal/ads/zn1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/k20;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/e30;->b:Lcom/google/android/gms/internal/ads/y20;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/y20;->a(Lcom/google/android/gms/internal/ads/y20;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/e30;->a:Lcom/google/android/gms/internal/ads/zn1;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zn1;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/e30;->b:Lcom/google/android/gms/internal/ads/y20;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/y20;->a(Lcom/google/android/gms/internal/ads/y20;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/e30;->a:Lcom/google/android/gms/internal/ads/zn1;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zn1;->a(Ljava/lang/Throwable;)V

    return-void
.end method
