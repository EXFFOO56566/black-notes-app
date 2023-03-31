.class public Lcom/google/android/gms/ads/mediation/q;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field protected a:Z

.field protected b:Z

.field protected c:Landroid/os/Bundle;

.field protected d:Landroid/view/View;

.field private e:Landroid/view/View;

.field private f:Lcom/google/android/gms/ads/p;

.field private g:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/mediation/q;->c:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public a()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/mediation/q;->d:Landroid/view/View;

    return-object v0
.end method

.method public a(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public a(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public final a(Lcom/google/android/gms/ads/p;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/mediation/q;->f:Lcom/google/android/gms/ads/p;

    return-void
.end method

.method public final a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/ads/mediation/q;->b:Z

    return-void
.end method

.method public final b()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/mediation/q;->c:Landroid/os/Bundle;

    return-object v0
.end method

.method public b(Landroid/view/View;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public final b(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/ads/mediation/q;->a:Z

    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/mediation/q;->b:Z

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/mediation/q;->a:Z

    return v0
.end method

.method public final e()Lcom/google/android/gms/ads/p;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/mediation/q;->f:Lcom/google/android/gms/ads/p;

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/mediation/q;->g:Z

    return v0
.end method

.method public g()V
    .locals 0

    return-void
.end method

.method public final h()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/mediation/q;->e:Landroid/view/View;

    return-object v0
.end method
