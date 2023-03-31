.class public final Lcom/google/android/gms/internal/ads/ee0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/r42;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/r42<",
        "Lcom/google/android/gms/internal/ads/p20<",
        "Lcom/google/android/gms/internal/ads/n00;",
        ">;>;"
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
            "Lcom/google/android/gms/internal/ads/k90;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/android/gms/internal/ads/e52;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/vd0;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/google/android/gms/internal/ads/e52;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/e80;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;)V
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
            "Lcom/google/android/gms/internal/ads/k90;",
            ">;",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/vd0;",
            ">;",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/e80;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ee0;->a:Lcom/google/android/gms/internal/ads/e52;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ee0;->b:Lcom/google/android/gms/internal/ads/e52;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/ee0;->c:Lcom/google/android/gms/internal/ads/e52;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/ee0;->d:Lcom/google/android/gms/internal/ads/e52;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/ee0;->e:Lcom/google/android/gms/internal/ads/e52;

    return-void
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ee0;->a:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/kv;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ee0;->b:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/g50$a;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ee0;->c:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/k90;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ee0;->d:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/vd0;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/ee0;->e:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/ads/e80;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/kv;->h()Lcom/google/android/gms/internal/ads/j10;

    move-result-object v0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/g50$a;->a()Lcom/google/android/gms/internal/ads/g50;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/j10;->d(Lcom/google/android/gms/internal/ads/g50;)Lcom/google/android/gms/internal/ads/j10;

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/j10;->b(Lcom/google/android/gms/internal/ads/k90;)Lcom/google/android/gms/internal/ads/j10;

    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/ads/j10;->a(Lcom/google/android/gms/internal/ads/vd0;)Lcom/google/android/gms/internal/ads/j10;

    new-instance v1, Lcom/google/android/gms/internal/ads/ry0;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/ry0;-><init>(Lcom/google/android/gms/internal/ads/u;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/j10;->b(Lcom/google/android/gms/internal/ads/ry0;)Lcom/google/android/gms/internal/ads/j10;

    new-instance v1, Lcom/google/android/gms/internal/ads/h20;

    invoke-direct {v1, v4}, Lcom/google/android/gms/internal/ads/h20;-><init>(Lcom/google/android/gms/internal/ads/e80;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/j10;->a(Lcom/google/android/gms/internal/ads/h20;)Lcom/google/android/gms/internal/ads/j10;

    new-instance v1, Lcom/google/android/gms/internal/ads/i00;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/i00;-><init>(Landroid/view/ViewGroup;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/j10;->a(Lcom/google/android/gms/internal/ads/i00;)Lcom/google/android/gms/internal/ads/j10;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/j10;->a()Lcom/google/android/gms/internal/ads/k10;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/k10;->c()Lcom/google/android/gms/internal/ads/p20;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/p20;

    return-object v0
.end method
