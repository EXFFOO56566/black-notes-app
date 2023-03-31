.class public final Lcom/google/android/gms/internal/ads/ju1$a;
.super Lcom/google/android/gms/internal/ads/rz1$a;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/e12;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ads/ju1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/rz1$a<",
        "Lcom/google/android/gms/internal/ads/ju1;",
        "Lcom/google/android/gms/internal/ads/ju1$a;",
        ">;",
        "Lcom/google/android/gms/internal/ads/e12;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/ju1;->u()Lcom/google/android/gms/internal/ads/ju1;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/rz1$a;-><init>(Lcom/google/android/gms/internal/ads/rz1;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/hu1;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ju1$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Lcom/google/android/gms/internal/ads/ju1$a;
    .locals 1

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/rz1$a;->d:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/rz1$a;->i()V

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->d:Z

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/rz1$a;->c:Lcom/google/android/gms/internal/ads/rz1;

    check-cast p1, Lcom/google/android/gms/internal/ads/ju1;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/ju1;->a(Lcom/google/android/gms/internal/ads/ju1;I)V

    return-object p0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/ju1$a;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/rz1$a;->i()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->d:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->c:Lcom/google/android/gms/internal/ads/rz1;

    check-cast v0, Lcom/google/android/gms/internal/ads/ju1;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/ju1;->a(Lcom/google/android/gms/internal/ads/ju1;Lcom/google/android/gms/internal/ads/dy1;)V

    return-object p0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/nu1;)Lcom/google/android/gms/internal/ads/ju1$a;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/rz1$a;->i()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->d:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rz1$a;->c:Lcom/google/android/gms/internal/ads/rz1;

    check-cast v0, Lcom/google/android/gms/internal/ads/ju1;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/ju1;->a(Lcom/google/android/gms/internal/ads/ju1;Lcom/google/android/gms/internal/ads/nu1;)V

    return-object p0
.end method
