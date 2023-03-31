.class public final Lcom/google/android/gms/internal/ads/kw0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/r42;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/r42<",
        "Lcom/google/android/gms/internal/ads/hw0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/e52;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/kv;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/internal/ads/e52;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/g50$a;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/internal/ads/e52;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/ry0;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/android/gms/internal/ads/e52;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/k90;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/kv;",
            ">;",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/g50$a;",
            ">;",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/ry0;",
            ">;",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/k90;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/kw0;->a:Lcom/google/android/gms/internal/ads/e52;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/kw0;->b:Lcom/google/android/gms/internal/ads/e52;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/kw0;->c:Lcom/google/android/gms/internal/ads/e52;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/kw0;->d:Lcom/google/android/gms/internal/ads/e52;

    return-void
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kw0;->a:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/kv;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kw0;->b:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/g50$a;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/kw0;->c:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/ry0;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/kw0;->d:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/k90;

    new-instance v4, Lcom/google/android/gms/internal/ads/hw0;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/hw0;-><init>(Lcom/google/android/gms/internal/ads/kv;Lcom/google/android/gms/internal/ads/g50$a;Lcom/google/android/gms/internal/ads/ry0;Lcom/google/android/gms/internal/ads/k90;)V

    return-object v4
.end method
