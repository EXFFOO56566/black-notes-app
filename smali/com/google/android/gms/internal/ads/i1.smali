.class public final Lcom/google/android/gms/internal/ads/i1;
.super Lcom/google/android/gms/internal/ads/y1;
.source ""


# instance fields
.field private final b:Landroid/graphics/drawable/Drawable;

.field private final c:Landroid/net/Uri;

.field private final d:D

.field private final e:I

.field private final f:I


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Landroid/net/Uri;DII)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/y1;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/i1;->b:Landroid/graphics/drawable/Drawable;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/i1;->c:Landroid/net/Uri;

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/i1;->d:D

    iput p5, p0, Lcom/google/android/gms/internal/ads/i1;->e:I

    iput p6, p0, Lcom/google/android/gms/internal/ads/i1;->f:I

    return-void
.end method


# virtual methods
.method public final getHeight()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/i1;->f:I

    return v0
.end method

.method public final getWidth()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/i1;->e:I

    return v0
.end method

.method public final l0()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/i1;->c:Landroid/net/Uri;

    return-object v0
.end method

.method public final l1()Lb/c/b/a/d/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/i1;->b:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v0

    return-object v0
.end method

.method public final s0()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/i1;->d:D

    return-wide v0
.end method
