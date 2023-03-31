.class public final Lcom/google/android/gms/internal/ads/qb1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/r42;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/r42<",
        "Lcom/google/android/gms/internal/ads/mb1<",
        "Lcom/google/android/gms/internal/ads/b00;",
        "Lcom/google/android/gms/internal/ads/h00;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/e52;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/e52<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/internal/ads/e52;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/df1;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/internal/ads/e52;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/vf1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Landroid/content/Context;",
            ">;",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/df1;",
            ">;",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/vf1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qb1;->a:Lcom/google/android/gms/internal/ads/e52;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/qb1;->b:Lcom/google/android/gms/internal/ads/e52;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/qb1;->c:Lcom/google/android/gms/internal/ads/e52;

    return-void
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qb1;->a:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/qb1;->b:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/df1;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/qb1;->c:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/vf1;

    sget-object v3, Lcom/google/android/gms/internal/ads/zr2;->u3:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-lez v3, :cond_0

    new-instance v3, Lcom/google/android/gms/internal/ads/ka1;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/ka1;-><init>()V

    sget-object v4, Lcom/google/android/gms/internal/ads/qf1;->d:Lcom/google/android/gms/internal/ads/qf1;

    new-instance v5, Lcom/google/android/gms/internal/ads/ua1;

    invoke-direct {v5, v3}, Lcom/google/android/gms/internal/ads/ua1;-><init>(Lcom/google/android/gms/internal/ads/mb1;)V

    invoke-virtual {v2, v4, v0, v1, v5}, Lcom/google/android/gms/internal/ads/vf1;->a(Lcom/google/android/gms/internal/ads/qf1;Landroid/content/Context;Lcom/google/android/gms/internal/ads/df1;Lcom/google/android/gms/internal/ads/hg1;)Lcom/google/android/gms/internal/ads/zf1;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/pa1;

    new-instance v2, Lcom/google/android/gms/internal/ads/db1;

    new-instance v3, Lcom/google/android/gms/internal/ads/eb1;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/eb1;-><init>()V

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/db1;-><init>(Lcom/google/android/gms/internal/ads/mb1;)V

    new-instance v3, Lcom/google/android/gms/internal/ads/va1;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zf1;->a:Lcom/google/android/gms/internal/ads/kf1;

    sget-object v5, Lcom/google/android/gms/internal/ads/jo;->a:Lcom/google/android/gms/internal/ads/ko1;

    invoke-direct {v3, v4, v5}, Lcom/google/android/gms/internal/ads/va1;-><init>(Lcom/google/android/gms/internal/ads/kf1;Ljava/util/concurrent/Executor;)V

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zf1;->b:Lcom/google/android/gms/internal/ads/ag1;

    sget-object v4, Lcom/google/android/gms/internal/ads/jo;->a:Lcom/google/android/gms/internal/ads/ko1;

    invoke-direct {v1, v2, v3, v0, v4}, Lcom/google/android/gms/internal/ads/pa1;-><init>(Lcom/google/android/gms/internal/ads/mb1;Lcom/google/android/gms/internal/ads/mb1;Lcom/google/android/gms/internal/ads/ag1;Ljava/util/concurrent/Executor;)V

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/ads/eb1;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/eb1;-><init>()V

    :goto_0
    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/mb1;

    return-object v1
.end method
