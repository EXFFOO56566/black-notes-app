.class public final Lcom/google/android/gms/internal/ads/ak0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/n5;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/v60;

.field private final c:Lcom/google/android/gms/internal/ads/uh;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/v60;Lcom/google/android/gms/internal/ads/id1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ak0;->b:Lcom/google/android/gms/internal/ads/v60;

    iget-object p1, p2, Lcom/google/android/gms/internal/ads/id1;->l:Lcom/google/android/gms/internal/ads/uh;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ak0;->c:Lcom/google/android/gms/internal/ads/uh;

    iget-object p1, p2, Lcom/google/android/gms/internal/ads/id1;->j:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ak0;->d:Ljava/lang/String;

    iget-object p1, p2, Lcom/google/android/gms/internal/ads/id1;->k:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ak0;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/uh;)V
    .locals 3
    .annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ak0;->c:Lcom/google/android/gms/internal/ads/uh;

    if-eqz v0, :cond_0

    move-object p1, v0

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/uh;->b:Ljava/lang/String;

    iget p1, p1, Lcom/google/android/gms/internal/ads/uh;->c:I

    goto :goto_0

    :cond_1
    const-string v0, ""

    const/4 p1, 0x1

    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/ads/sg;

    invoke-direct {v1, v0, p1}, Lcom/google/android/gms/internal/ads/sg;-><init>(Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ak0;->b:Lcom/google/android/gms/internal/ads/v60;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ak0;->d:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ak0;->e:Ljava/lang/String;

    invoke-virtual {p1, v1, v0, v2}, Lcom/google/android/gms/internal/ads/v60;->a(Lcom/google/android/gms/internal/ads/ug;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final j()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ak0;->b:Lcom/google/android/gms/internal/ads/v60;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/v60;->V()V

    return-void
.end method

.method public final z()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ak0;->b:Lcom/google/android/gms/internal/ads/v60;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/v60;->U()V

    return-void
.end method
