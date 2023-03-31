.class public final Lcom/google/android/gms/internal/ads/ik2$b;
.super Lcom/google/android/gms/internal/ads/rz1$a;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/e12;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ads/ik2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/rz1$a<",
        "Lcom/google/android/gms/internal/ads/ik2;",
        "Lcom/google/android/gms/internal/ads/ik2$b;",
        ">;",
        "Lcom/google/android/gms/internal/ads/e12;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/ik2;->r()Lcom/google/android/gms/internal/ads/ik2;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/rz1$a;-><init>(Lcom/google/android/gms/internal/ads/rz1;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/hk2;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ik2$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/ik2$a;)Lcom/google/android/gms/internal/ads/ik2$b;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/rz1$a;->i()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->d:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->c:Lcom/google/android/gms/internal/ads/rz1;

    check-cast v0, Lcom/google/android/gms/internal/ads/ik2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/ik2;->a(Lcom/google/android/gms/internal/ads/ik2;Lcom/google/android/gms/internal/ads/ik2$a;)V

    return-object p0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/rk2$a;)Lcom/google/android/gms/internal/ads/ik2$b;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/rz1$a;->i()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->d:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->c:Lcom/google/android/gms/internal/ads/rz1;

    check-cast v0, Lcom/google/android/gms/internal/ads/ik2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/rz1$a;->e()Lcom/google/android/gms/internal/ads/c12;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/rz1;

    check-cast p1, Lcom/google/android/gms/internal/ads/rk2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/ik2;->a(Lcom/google/android/gms/internal/ads/ik2;Lcom/google/android/gms/internal/ads/rk2;)V

    return-object p0
.end method
