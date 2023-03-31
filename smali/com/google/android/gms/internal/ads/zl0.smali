.class public final Lcom/google/android/gms/internal/ads/zl0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/r42;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/r42<",
        "Lcom/google/android/gms/internal/ads/wj2;",
        ">;"
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
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/internal/ads/e52;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/fo;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/android/gms/internal/ads/e52;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/ik2$a;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/google/android/gms/internal/ads/e52;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/e52<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Landroid/content/Context;",
            ">;",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/fo;",
            ">;",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/ik2$a;",
            ">;",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zl0;->a:Lcom/google/android/gms/internal/ads/e52;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zl0;->b:Lcom/google/android/gms/internal/ads/e52;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zl0;->c:Lcom/google/android/gms/internal/ads/e52;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zl0;->d:Lcom/google/android/gms/internal/ads/e52;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zl0;->e:Lcom/google/android/gms/internal/ads/e52;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;)Lcom/google/android/gms/internal/ads/zl0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Landroid/content/Context;",
            ">;",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/fo;",
            ">;",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/ik2$a;",
            ">;",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/internal/ads/zl0;"
        }
    .end annotation

    new-instance v6, Lcom/google/android/gms/internal/ads/zl0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zl0;-><init>(Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/e52;)V

    return-object v6
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zl0;->a:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zl0;->b:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zl0;->c:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/fo;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zl0;->d:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/ik2$a;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zl0;->e:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    new-instance v5, Lcom/google/android/gms/internal/ads/wj2;

    new-instance v6, Lcom/google/android/gms/internal/ads/ak2;

    invoke-direct {v6, v0}, Lcom/google/android/gms/internal/ads/ak2;-><init>(Landroid/content/Context;)V

    invoke-direct {v5, v6}, Lcom/google/android/gms/internal/ads/wj2;-><init>(Lcom/google/android/gms/internal/ads/ak2;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/hl2;->p()Lcom/google/android/gms/internal/ads/hl2$a;

    move-result-object v0

    iget v6, v2, Lcom/google/android/gms/internal/ads/fo;->c:I

    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/hl2$a;->a(I)Lcom/google/android/gms/internal/ads/hl2$a;

    iget v6, v2, Lcom/google/android/gms/internal/ads/fo;->d:I

    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/hl2$a;->b(I)Lcom/google/android/gms/internal/ads/hl2$a;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/fo;->e:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/hl2$a;->c(I)Lcom/google/android/gms/internal/ads/hl2$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/rz1;

    check-cast v0, Lcom/google/android/gms/internal/ads/hl2;

    new-instance v2, Lcom/google/android/gms/internal/ads/am0;

    invoke-direct {v2, v3, v1, v0, v4}, Lcom/google/android/gms/internal/ads/am0;-><init>(Lcom/google/android/gms/internal/ads/ik2$a;Ljava/lang/String;Lcom/google/android/gms/internal/ads/hl2;Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/ads/wj2;->a(Lcom/google/android/gms/internal/ads/zj2;)V

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v5, v0}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v5, Lcom/google/android/gms/internal/ads/wj2;

    return-object v5
.end method
