.class public final Lcom/google/android/gms/internal/ads/mj1$b;
.super Lcom/google/android/gms/internal/ads/rz1$a;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/e12;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ads/mj1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/rz1$a<",
        "Lcom/google/android/gms/internal/ads/mj1;",
        "Lcom/google/android/gms/internal/ads/mj1$b;",
        ">;",
        "Lcom/google/android/gms/internal/ads/e12;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/mj1;->q()Lcom/google/android/gms/internal/ads/mj1;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/rz1$a;-><init>(Lcom/google/android/gms/internal/ads/rz1;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/lj1;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/mj1$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/fj1$b;)Lcom/google/android/gms/internal/ads/mj1$b;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/rz1$a;->i()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->d:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->c:Lcom/google/android/gms/internal/ads/rz1;

    check-cast v0, Lcom/google/android/gms/internal/ads/mj1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/rz1;

    check-cast p1, Lcom/google/android/gms/internal/ads/fj1;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/mj1;->a(Lcom/google/android/gms/internal/ads/mj1;Lcom/google/android/gms/internal/ads/fj1;)V

    return-object p0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/mj1$a;)Lcom/google/android/gms/internal/ads/mj1$b;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/rz1$a;->i()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->d:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->c:Lcom/google/android/gms/internal/ads/rz1;

    check-cast v0, Lcom/google/android/gms/internal/ads/mj1;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/mj1;->a(Lcom/google/android/gms/internal/ads/mj1;Lcom/google/android/gms/internal/ads/mj1$a;)V

    return-object p0
.end method

.method public final a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/mj1$b;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/rz1$a;->i()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->d:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->c:Lcom/google/android/gms/internal/ads/rz1;

    check-cast v0, Lcom/google/android/gms/internal/ads/mj1;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/mj1;->a(Lcom/google/android/gms/internal/ads/mj1;Ljava/lang/String;)V

    return-object p0
.end method
