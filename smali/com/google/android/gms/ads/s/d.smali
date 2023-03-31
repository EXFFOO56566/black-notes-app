.class public final Lcom/google/android/gms/ads/s/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/ads/s/d$a;
    }
.end annotation


# instance fields
.field private final a:Z

.field private final b:I

.field private final c:I

.field private final d:Z

.field private final e:I

.field private final f:Lcom/google/android/gms/ads/q;

.field private final g:Z


# direct methods
.method private constructor <init>(Lcom/google/android/gms/ads/s/d$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/ads/s/d$a;->a(Lcom/google/android/gms/ads/s/d$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/s/d;->a:Z

    invoke-static {p1}, Lcom/google/android/gms/ads/s/d$a;->b(Lcom/google/android/gms/ads/s/d$a;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/s/d;->b:I

    invoke-static {p1}, Lcom/google/android/gms/ads/s/d$a;->c(Lcom/google/android/gms/ads/s/d$a;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/s/d;->c:I

    invoke-static {p1}, Lcom/google/android/gms/ads/s/d$a;->d(Lcom/google/android/gms/ads/s/d$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/s/d;->d:Z

    invoke-static {p1}, Lcom/google/android/gms/ads/s/d$a;->e(Lcom/google/android/gms/ads/s/d$a;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/s/d;->e:I

    invoke-static {p1}, Lcom/google/android/gms/ads/s/d$a;->f(Lcom/google/android/gms/ads/s/d$a;)Lcom/google/android/gms/ads/q;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/s/d;->f:Lcom/google/android/gms/ads/q;

    invoke-static {p1}, Lcom/google/android/gms/ads/s/d$a;->g(Lcom/google/android/gms/ads/s/d$a;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/ads/s/d;->g:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/ads/s/d$a;Lcom/google/android/gms/ads/s/m;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/ads/s/d;-><init>(Lcom/google/android/gms/ads/s/d$a;)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/s/d;->e:I

    return v0
.end method

.method public final b()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget v0, p0, Lcom/google/android/gms/ads/s/d;->b:I

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/s/d;->c:I

    return v0
.end method

.method public final d()Lcom/google/android/gms/ads/q;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/s/d;->f:Lcom/google/android/gms/ads/q;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/s/d;->d:Z

    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/s/d;->a:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/s/d;->g:Z

    return v0
.end method
