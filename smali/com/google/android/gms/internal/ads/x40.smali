.class final Lcom/google/android/gms/internal/ads/x40;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/q60;
.implements Lcom/google/android/gms/internal/ads/l70;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/internal/ads/id1;

.field private final d:Lcom/google/android/gms/internal/ads/ie;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/ie;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/x40;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/x40;->c:Lcom/google/android/gms/internal/ads/id1;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/x40;->d:Lcom/google/android/gms/internal/ads/ie;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/x40;->d:Lcom/google/android/gms/internal/ads/ie;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ie;->a()V

    return-void
.end method

.method public final b(Landroid/content/Context;)V
    .locals 0

    return-void
.end method

.method public final d(Landroid/content/Context;)V
    .locals 0

    return-void
.end method

.method public final s()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/x40;->c:Lcom/google/android/gms/internal/ads/id1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/id1;->U:Lcom/google/android/gms/internal/ads/ge;

    if-eqz v0, :cond_2

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/ge;->a:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/x40;->c:Lcom/google/android/gms/internal/ads/id1;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/id1;->U:Lcom/google/android/gms/internal/ads/ge;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/ge;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/x40;->c:Lcom/google/android/gms/internal/ads/id1;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/id1;->U:Lcom/google/android/gms/internal/ads/ge;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/ge;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/x40;->d:Lcom/google/android/gms/internal/ads/ie;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/x40;->b:Landroid/content/Context;

    invoke-interface {v1, v2, v0}, Lcom/google/android/gms/internal/ads/ie;->a(Landroid/content/Context;Ljava/util/List;)V

    :cond_2
    :goto_0
    return-void
.end method
