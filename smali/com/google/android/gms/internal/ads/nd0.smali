.class public final Lcom/google/android/gms/internal/ads/nd0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/u50;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/m60;

.field private final c:Lcom/google/android/gms/internal/ads/id1;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/m60;Lcom/google/android/gms/internal/ads/id1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/nd0;->b:Lcom/google/android/gms/internal/ads/m60;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/nd0;->c:Lcom/google/android/gms/internal/ads/id1;

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 0

    return-void
.end method

.method public final B()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nd0;->c:Lcom/google/android/gms/internal/ads/id1;

    iget v0, v0, Lcom/google/android/gms/internal/ads/id1;->O:I

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nd0;->b:Lcom/google/android/gms/internal/ads/m60;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/m60;->K()V

    :cond_1
    return-void
.end method

.method public final G()V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/ug;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final x()V
    .locals 0

    return-void
.end method

.method public final y()V
    .locals 0

    return-void
.end method
