.class final Lcom/google/android/gms/internal/ads/ua1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/hg1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lcom/google/android/gms/internal/ads/e50<",
        "TAdT;>;AdT:",
        "Lcom/google/android/gms/internal/ads/k20;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/hg1<",
        "TAdT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/mb1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/mb1<",
            "TR;",
            "Lcom/google/android/gms/internal/ads/rf1<",
            "TAdT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/mb1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/mb1<",
            "TR;",
            "Lcom/google/android/gms/internal/ads/rf1<",
            "TAdT;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ua1;->a:Lcom/google/android/gms/internal/ads/mb1;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/gg1;)Lcom/google/android/gms/internal/ads/lo1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/gg1;",
            ")",
            "Lcom/google/android/gms/internal/ads/lo1<",
            "Lcom/google/android/gms/internal/ads/rf1<",
            "TAdT;>;>;"
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/internal/ads/ta1;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ua1;->a:Lcom/google/android/gms/internal/ads/mb1;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/ta1;->b:Lcom/google/android/gms/internal/ads/nb1;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/ta1;->a:Lcom/google/android/gms/internal/ads/ob1;

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/mb1;->a(Lcom/google/android/gms/internal/ads/nb1;Lcom/google/android/gms/internal/ads/ob1;)Lcom/google/android/gms/internal/ads/lo1;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/google/android/gms/internal/ads/rf1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/rf1<",
            "TAdT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ua1;->a:Lcom/google/android/gms/internal/ads/mb1;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/mb1;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/e50;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/e50;->a()Lcom/google/android/gms/internal/ads/l30;

    move-result-object v0

    iput-object v0, p1, Lcom/google/android/gms/internal/ads/rf1;->a:Lcom/google/android/gms/internal/ads/l30;

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method
