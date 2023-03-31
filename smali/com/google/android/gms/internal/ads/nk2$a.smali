.class public final Lcom/google/android/gms/internal/ads/nk2$a;
.super Lcom/google/android/gms/internal/ads/rz1$a;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/e12;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ads/nk2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/rz1$a<",
        "Lcom/google/android/gms/internal/ads/nk2;",
        "Lcom/google/android/gms/internal/ads/nk2$a;",
        ">;",
        "Lcom/google/android/gms/internal/ads/e12;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/nk2;->r()Lcom/google/android/gms/internal/ads/nk2;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/rz1$a;-><init>(Lcom/google/android/gms/internal/ads/rz1;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/hk2;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/nk2$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Lcom/google/android/gms/internal/ads/nk2$a;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/rz1$a;->i()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->d:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->c:Lcom/google/android/gms/internal/ads/rz1;

    check-cast v0, Lcom/google/android/gms/internal/ads/nk2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/nk2;->a(Lcom/google/android/gms/internal/ads/nk2;I)V

    return-object p0
.end method

.method public final a(Z)Lcom/google/android/gms/internal/ads/nk2$a;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/rz1$a;->i()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->d:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->c:Lcom/google/android/gms/internal/ads/rz1;

    check-cast v0, Lcom/google/android/gms/internal/ads/nk2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/nk2;->a(Lcom/google/android/gms/internal/ads/nk2;Z)V

    return-object p0
.end method

.method public final m()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->c:Lcom/google/android/gms/internal/ads/rz1;

    check-cast v0, Lcom/google/android/gms/internal/ads/nk2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/nk2;->p()Z

    move-result v0

    return v0
.end method
