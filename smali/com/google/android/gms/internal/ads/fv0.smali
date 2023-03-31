.class final Lcom/google/android/gms/internal/ads/fv0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/id0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/id1;

.field private final b:Lcom/google/android/gms/internal/ads/qc;

.field private final c:Z

.field private d:Lcom/google/android/gms/internal/ads/m60;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/qc;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/fv0;->d:Lcom/google/android/gms/internal/ads/m60;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fv0;->a:Lcom/google/android/gms/internal/ads/id1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/fv0;->b:Lcom/google/android/gms/internal/ads/qc;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/fv0;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/m60;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fv0;->d:Lcom/google/android/gms/internal/ads/m60;

    return-void
.end method

.method public final a(ZLandroid/content/Context;)V
    .locals 1

    :try_start_0
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/fv0;->c:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/fv0;->b:Lcom/google/android/gms/internal/ads/qc;

    invoke-static {p2}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/qc;->H(Lb/c/b/a/d/a;)Z

    move-result p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/fv0;->b:Lcom/google/android/gms/internal/ads/qc;

    invoke-static {p2}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/qc;->B(Lb/c/b/a/d/a;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/fv0;->d:Lcom/google/android/gms/internal/ads/m60;

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/fv0;->a:Lcom/google/android/gms/internal/ads/id1;

    iget p2, p2, Lcom/google/android/gms/internal/ads/id1;->O:I

    const/4 v0, 0x2

    if-ne p2, v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/m60;->K()V

    :cond_2
    return-void

    :cond_3
    new-instance p1, Lcom/google/android/gms/internal/ads/hd0;

    const-string p2, "Adapter failed to show."

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/hd0;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    new-instance p2, Lcom/google/android/gms/internal/ads/hd0;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/hd0;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
